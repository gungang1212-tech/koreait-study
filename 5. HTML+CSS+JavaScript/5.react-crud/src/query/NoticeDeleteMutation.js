import { useMutation } from "@tanstack/react-query"
import {noticeDeleteApi} from  "../api/boardApi"
import { useQueryClient } from "@tanstack/react-query";

export const useNoticeDeleteMutation = () => {
    const queryClient = useQueryClient();

    return useMutation({
        mutationFn : (postId) => noticeDeleteApi(postId),
        onSucess: () => {
            queryClient.invalidateQueries({
                queryKey: ['noticeList']
            })
        }
    })
}