import { useState, useRef } from 'react'; // useRef 추가
import { Link, useNavigate } from "react-router-dom"; // useNavigate 추가
import Header from "../components/Header";
import { useFileUploadHook } from "../hooks/useFileUploadHook";
import { useQuillEditorHook } from "../hooks/useQuillEditorHook";
import { useNoticeCreateMutation } from "../query/NoticeCreateMutation";

function NoticeWrite() {
    const navigate = useNavigate();
    
    // 파일 업로드 관련 훅 (함수명 오타 handleImageChange 확인)
    const { selectedFiles, imagePreview, handleImageChange } = useFileUploadHook();
    
    // 에디터 초기화 훅 (ref 전달 필요 여부는 훅 내부 구현에 따라 다를 수 있음)
    const { quillRef } = useQuillEditorHook(); 

    const [category, setCategory] = useState('공지'); // 초기값 설정
    const [title, setTitle] = useState('');
    const noticeCreateMutation = useNoticeCreateMutation();

    const handleSubmit = (e) => { // e 파라미터 추가
        e.preventDefault();
        
        // Quill 에디터 내용 가져오기 (DOM 구조에 따라 .ql-editor 확인 필요)
        const editorElement = document.querySelector('.ql-editor');
        const content = editorElement ? editorElement.innerHTML : "";

        const formData = new FormData();
        formData.append("title", title);
        formData.append("content", content);
        formData.append("category", category);

        if (selectedFiles) {
            selectedFiles.forEach(file => {
                formData.append("files", file);
            });
        }

        noticeCreateMutation.mutate(formData);
    }

    return (
        <>
            <Header />
            <div className="container">
                <h1 style={{ marginBottom: "2rem" }}>공지사항 작성</h1>
                <div className="form-card" style={{ maxWidth: 800 }}>
                    {/* onsubmit -> onSubmit (대문자) */}
                    <form onSubmit={handleSubmit}> 
                        <div className="form-group">
                            <label>분류</label>
                            <select
                                id="announcementCategory"
                                value={category}
                                onChange={(e) => setCategory(e.target.value)}
                                style={{
                                    width: "100%",
                                    padding: "0.75rem",
                                    border: "1px solid var(--border)",
                                    borderRadius: "0.5rem"
                                }}
                            >
                                <option value="공지">공지</option>
                                <option value="점검">점검</option>
                                <option value="이벤트">이벤트</option>
                            </select>
                        </div>
                        <div className="form-group">
                            <label>제목</label>
                            <input
                                type="text"
                                id="announcementTitle"
                                placeholder="공지사항 제목을 입력하세요"
                                required
                                value={title}
                                onChange={(e) => setTitle(e.target.value)} // onChagne 오타 수정
                            />
                        </div>
                        <div className="form-group">
                            <label>내용</label>
                            {/* ref 연결 */}
                            <div id="noticeEditor" className="editor-container" />
                        </div>
                        <div className="form-group">
                            <label>이미지 업로드</label>
                            <input 
                                type="file" 
                                id="announcementImage" 
                                accept="image/*" 
                                onChange={handleImageChange} // handleimageChange 오타 수정
                            />
                            {imagePreview && (
                                <img src={imagePreview} alt="미리보기" style={{ width: '200px', marginTop: '10px' }} />
                            )}
                        </div>
                        <div className="form-actions">
                            <button type="submit" className="btn btn-primary" disabled={noticeCreateMutation.isLoading}>
                                {noticeCreateMutation.isLoading ? "등록 중..." : "작성"}
                            </button>
                            <Link
                                to="/notice/list"
                                className="btn btn-secondary"
                                style={{ textDecoration: "none" }}
                            >
                                취소
                            </Link>
                        </div>
                    </form>
                </div>
            </div>
        </>
    )
}

export default NoticeWrite;