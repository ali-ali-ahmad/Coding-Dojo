import React, { useState, useEffect } from "react";
// import { useEffect } from "react";

const Effect = (props) => {
    const [people, setPeople] = useState(["first"]);
 
    useEffect(() => {
        fetch('https://api.github.com/users/alirabah93')
            .then(response => response.json())
            .then(response => setPeople(response.results))
    }, []);
 
    return (
        <div>
            {people ? people.map((person, index)=>{
                return (<div key={index}>{person}</div>)
            }):null}
        </div>
    );
}
export default Effect;
// const Effect = (props) => {
//     const [people, setPeople] = useState([]);
 
//     useEffect(() => {
//         fetch('https://swapi.dev/api/people/')
//             .then(response => response.json())
//             .then(response => setPeople(response.results))
//     }, []);
 
//     return (
//         <div>
//             {people.length > 0 && people.map((person, index)=>{
//                 return (<div key={index}>{person.name}</div>)
//             })}
//         </div>
//     );
// }
// export default Effect;



