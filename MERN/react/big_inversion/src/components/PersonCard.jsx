import React from 'react';

const PersonCard = (props) => {
    const { firstName, lastName, age, hairColor } = props;
    return (
        <div>
            <h1>{lastName}, {firstName}</h1>
            <h4>Age: {age}</h4>
            <h5>Hair Color: {hairColor}</h5>
            <hr/>
        </div>
    )
}


    
export default PersonCard;
