import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams, useNavigate } from "react-router-dom";
import AuthorForm from '../components/AuthorForm';
import DeleteButton from '../components/DeleteButton';
import { Link } from 'react-router-dom';
    
const Update = (props) => {
    const { id } = useParams();
    const [author, setAuthor] = useState();
    const [loaded, setLoaded] = useState(false);
    const navigate = useNavigate();
    const [errors, setErrors] = useState([]); 
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/authors/' + id)
            .then(res => {
                setAuthor(res.data);
                setLoaded(true);
            })
    }, [id]);
    
    const updateAuthor = author => {
        axios.put('http://localhost:8000/api/authors/' + id, author)
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
                <Link to={'/'}>back</Link>
                <h1>Update a Author</h1>
                {loaded && (
                    <>
                        <AuthorForm
                            onSubmitProp={updateAuthor}
                            initialName={author.name}
                            errorsGen={errors}
                        />
                        <DeleteButton authorId={author._id} successCallback={() => navigate("/")} />
                    </>
                )}
            </div>
        </>
    )
}
    
export default Update;

