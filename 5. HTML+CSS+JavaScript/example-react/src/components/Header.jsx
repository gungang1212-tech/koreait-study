import { Link } from "react-router-dom";
import { useLocation } from 'react-router'

function Header(){
    const location = useLocation();

    const isActive = (path) => {
        return location.pathname === path ? 'nav-link active' : 'nav-link';
    }

    return (
        <header style={{padding:"20px", borderBottom:"1px solid #ddd"}}>
            <nav>
                {/* 
                    아래의 a 태그를 Link 컴포넌트로 변경하세요.
                        - Home을 클릭하면 "/" 으로 이동합니다.
                        - Users를 클릭하면 "/users" 으로 이동합니다.
                */}
                <Link to = "/" className = {isActive('/')}>Home</Link>
                
                <Link to = "/users" className ={isActive('users')}>Home</Link>
                
            </nav>
        </header>
    )
}

export default Header