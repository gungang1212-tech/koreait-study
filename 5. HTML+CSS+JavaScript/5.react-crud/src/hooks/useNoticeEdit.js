import { useState, useEffect, useRef } from 'react';
import { useParams, useNavigate } from 'react-router-dom'; // 경로 확인 필요
import { useQueryClient } from '@tanstack/react-query'; // 대문자 Q 확인
import { useNoticeEditFormQuery } from '../query/NoticeEditFormQuery';
// import { noticeEditApi } from '../api/boardApi'; // 사용 예정이라면 유지

export const useNoticeEdit = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const queryClient = useQueryClient();
    // Id -> id로 수정 (자바스크립트는 대소문자 구분함)
    const postId = id ? parseInt(id) : null;

    const { data: boardDTO, isLoading, isError, error } = useNoticeEditFormQuery(postId);

    const [category, setCategory] = useState('');
    const [title, setTitle] = useState('');
    const [imagePreview, setImagePreview] = useState(null);
    const [selectedFiles, setSelectedFiles] = useState([]); // 오타 수정: Seleted -> Selected
    const [isSubmitting, setIsSubmitting] = useState(false);
    const [editorReady, setEditorReady] = useState(false);

    const quillRef = useRef(null);
    const contentLoadedRef = useRef(false);
    const editorInitalizedRef = useRef(false); // 아래 오타와 통일 필요

    useEffect(() => {
        if (boardDTO) {
            setCategory(boardDTO.category || '공지');
            setTitle(boardDTO.title || '');
        }
    }, [boardDTO]);

    useEffect(() => {
        let timeoutId = null;
        let retryCount = 0;
        const maxRetries = 50;

        const initEditor = () => {
            const editorElement = document.getElementById('noticeEditor');

            // 1. 에디터를 그릴 엘리먼트가 없거나 Quill 라이브러리가 로드 전인 경우 재시도
            if (!editorElement || typeof window.Quill === 'undefined') {
                if (retryCount < maxRetries) {
                    retryCount++;
                    timeoutId = setTimeout(initEditor, 100);
                } else {
                    console.log('[NoticeEdit] Quill 또는 엘리먼트를 찾을 수 없습니다.');
                }
                return;
            }

            // 2. 이미 초기화되었다면 중단
            if (editorInitalizedRef.current || quillRef.current) {
                return;
            }

            // 3. 실제 초기화 진행
            try {
                const quill = new window.Quill('#noticeEditor', {
                    theme: 'snow',
                    placeholder: '공지사항 내용을 입력하세요',
                    modules: {
                        toolbar: [
                            [{ 'header': [1, 2, 3, false] }],
                            ['bold', 'italic', 'underline', 'strike'],
                            ['blockquote', 'code-block'],
                            [{ 'list': 'ordered' }, { 'list': 'bullet' }], // ordered에 따옴표 추가
                            ['link', 'image'],
                            ['clean']
                        ]
                    }
                });

                quillRef.current = quill;
                editorInitalizedRef.current = true; // 변수명 오타 수정
                setEditorReady(true);
                quill.enable(true);
            } catch (err) {
                console.log('[NoticeEdit] Quill 에디터 초기화 실패:', err);
            }
        };

        initEditor();

        return () => {
            if (timeoutId) {
                clearTimeout(timeoutId);
            }
        };
    }, []);

    useEffect(() => {
        if (editorReady && quillRef.current && boardDTO.content && !contentLoadedRef.current)
            try {
                const content = boardDTO.content || '';
            }
    })  
};