import React, { Component } from 'react';
    
    
class PersonCard extends Component {
    render() {
        const { firstName, lastName, age, hairColor } = this.props;
        return (
        <div>
            <h1>{lastName}, {firstName}</h1>
            <h4>Age: {age}</h4>
            <h5>Hair Color: {hairColor}</h5>
            <hr/>
            {/* {children} */}
        </div>
        );
    }
}
    
export default PersonCard;
