import {
    Link,
    Routes,
    Route
} from "react-router-dom";
import { useParams } from "react-router";
    
const Routing = (props) => {
    const Home = () => { 
        return (
        <h1>Welcome!</h1>
        );
    }

    const Number = () => { 
        const { num } = useParams();
        
        return (
        <h1>The Number is: { num }</h1>
        );
    }

    const Random = () => { 
        const { randomText } = useParams();
        
        return (
        <h1>The word is: { randomText }</h1>
        );
    }

    const Styling = () => {
        const { randomText } = useParams();
        const { textColor } = useParams();
        const { backGroundColor } = useParams();
        return (
        <h1 
        style={{
            color: textColor,
            backgroundColor: backGroundColor,
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
        }}
        >The word is: { randomText }</h1>
        );
    }
    
    return (
        <div>
            <p>
            <Link to="/home">Home</Link>
                |
            <Link to="/4">Number 4</Link>
                |
            <Link to="/hello">Hello</Link>
                |
            <Link to="/Hello/red/blue">styled Hello</Link>
            </p>
            <Routes>
            <Route path="/home" element={<Home />}/>
            <Route path="/:num" element={<Number />}/>
            <Route path="/:randomText" element={<Random />}/>
            <Route path="/:randomText/:textColor/:backGroundColor" element={<Styling />}/>
            </Routes>
        </div>
        );
}

export default Routing;

