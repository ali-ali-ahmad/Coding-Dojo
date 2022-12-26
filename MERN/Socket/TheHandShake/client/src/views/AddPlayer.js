import React, {useState} from 'react'
import axios from 'axios';
import PlayerForm from '../components/PlayerForm';
import './css/main.css'
// import { Link } from 'react-router-dom';
import { useNavigate } from "react-router-dom";

const Main = (props) => {
    const navigate = useNavigate();
    const [errors, setErrors] = useState([]); 


    const createPlayer = player => {
        axios.post('http://localhost:8000/api/players', player)
            .then(res=>{navigate("/")})
            .catch(err=>{
                const errorResponse = err.response.data.errors;
                const errorArr = [];
                for (const key of Object.keys(errorResponse)) {
                    errorArr.push(errorResponse[key].message)
                }
                setErrors(errorArr);
            }) 
    }

    return (
        <>
        <div>
            {/* <Link to={'/'}>Home</Link> */}
            <h1>Add a new Player</h1>
            <PlayerForm onSubmitProp={createPlayer} initialName="" initialPosition="" errorsGen={errors}/>
        </div>
        </>
    )
};

export default Main;



