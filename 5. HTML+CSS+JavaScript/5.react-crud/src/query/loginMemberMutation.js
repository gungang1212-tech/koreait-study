import { useNavigate } from "react-router-dom"
import { loginMemberApi } from "../api/memberApi";
import { useMutation } from "@tanstack/react-query";
import { useQueryClient } from "@tanstack/react-query";

export const useLoginMemberMutation = () => {
    const navigate = useNavigate();
    const queryClient = useQueryClient();

    return useMutation({
        mutationFn: loginMemberApi,
        onSuccess: (data) => {
            alert("로그인 되었습니다.");
            queryClient.invalidateQueries({queryKey: ['checkMember']})
            navigate('/');
        },
        onError: (error) => {
            alert("로그인 요청 중 오류가 발생했습니다.")
        }
    })

}