import React, { Component } from 'react';
    
    
class PersonCard extends Component {
    constructor(props) {
        super(props);
        this.state = {
            age: this.props.age,
        };
    }
    counterMaker = () => { 
        this.setState({ age: this.state.age +1 });
    }

    render() {
        const { firstName, lastName, hairColor } = this.props;
        return (
        <div>
            <h1>{lastName}, {firstName}</h1>
            <h4>Age: {this.state.age}</h4>
            <h5>Hair Color: {hairColor}</h5>
            <button className="button" onClick= { this.counterMaker }>birthday +</button>
            <hr/>
        </div>
        );
    }
}
    
export default PersonCard;
