import React, { useState, useEffect } from "react";
// import { useEffect } from "react";

const Effect = (props) => {
    const [people, setPeople] = useState([]);


    useEffect(() => {
        // fetch('https://swapi.dev/api/people/')
        //     .then(response => response.json())
        //     .then(response => setPeople(response.results))
        alert("Heloooooo");
    }, []);

    return (
        <div>
            {people.length > 0 && people.map((person, index)=>{
                return (<div key={index}>{person.birth_year}</div>)
            })}
        </div>
    );
}
export default Effect;

