import axios from 'axios';

const axiosInstance = axios.create({
    baseURL: 'https://d3dnecrll4wnax.cloudfront.net',
    timeout: 10000,
    header: {
        'Content-Type': 'application/json'
    }
})

export default axiosInstance;