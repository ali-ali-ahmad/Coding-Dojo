import React, {useState, useEffect} from 'react'
import axios from 'axios';
import AuthorList from '../components/AuthorList';
import './css/main.css'
import { Link } from 'react-router-dom';

const Main = (props) => {
    const [authors, setAuthors] = useState();
    const [loaded, setLoaded] = useState(false);

    useEffect (() =>{
        axios.get('http://localhost:8000/api/authors')
            .then(res => {
                setAuthors(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    }, []);

    const removeFromDom = authorId => {
        setAuthors(authors.filter(author => author._id !== authorId));
    }

    return (
        <div className='mainPage'>

            <div>
                <Link to={'/authors'}>Add an Author</Link>
                <p>We have quotes by:</p>
                {loaded && <AuthorList authors={authors} removeFromDom={removeFromDom}/>}
            </div>
        </div>
    )
};

export default Main;



