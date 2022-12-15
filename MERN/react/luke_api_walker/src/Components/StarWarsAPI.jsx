import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { useNavigate} from "react-router-dom";


const StarWarsAPI = () => {

    const [data, setData] = useState({});
    let [category, setGategory] = useState("people");
    let [id, setId] = useState(1);
    const [URL, setURL] = useState(["people",1]);
    const navigate = useNavigate();

    useEffect(()=>{
        axios.get(`https://swapi.dev/api/${URL[0]}/${URL[1]}`)
        .then(response => setData(response.data), navigate(`/${URL[0]}/${URL[1]}/`))
        .catch((err) => {console.log(err.message)});
        // navigate(`/${URL[0]}/${URL[1]}/`);
    }, [URL]); 

    const SearchHandle = (e) => {
        e.preventDefault();
        setURL([category, id]);
        // navigate(`/${URL[0]}/${URL[1]}/`);
    };

    return (
        <>
        <div>
            <form onSubmit={ SearchHandle }>
                <select onChange={ (e) => setGategory(e.target.value)} value={ category }>
                    <option value="people">People</option>
                    <option value="planets">planets</option>
                    <option value="films">films</option>
                    <option value="species">species</option>
                    <option value="vehicles">vehicles</option>
                    <option value="starships">starships</option>
                </select>
                <label>ID:</label>
                <input type="number" onChange={ (e) => setId(e.target.value) } value={ id } />
                <input type="submit" value="Search" />
            </form>
        </div>
            <ul>
            {Object.keys(data).map((key) => (
                <li key={key}>{key}: {data[key]}</li>
                ))}
            </ul>
        </>
    );
};
export default StarWarsAPI;