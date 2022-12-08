import React, { useState } from  'react';
import './UserFrom_style.css';
    
    
const UserForm = () => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, confirmPassword };
        console.log("Welcome", newUser);
    };
    
    return(
        <div>
            <div className='formBody'>
                <form onSubmit={ createUser }>
                    <div className='wrapper'>
                        <label>First Name: </label> 
                        <input className='input' type="text" onChange={ (e) => setFirstName(e.target.value) } />
                    </div>
                    <div className='wrapper'>
                        <label>Last Name: </label> 
                        <input className='input' type="text" onChange={ (e) => setLastName(e.target.value) } />
                    </div>
                    <div className='wrapper'>
                        <label>Email Address: </label> 
                        <input className='input' type="text" onChange={ (e) => setEmail(e.target.value) } />
                    </div>
                    <div className='wrapper'>
                        <label>Password: </label>
                        <input className='input' type="text" onChange={ (e) => setPassword(e.target.value) } />
                    </div>
                    <div className='wrapper'>
                        <label>Confirm Password: </label>
                        <input className='input' type="text" onChange={ (e) => setConfirmPassword(e.target.value) } />
                    </div>
                    <input type="submit" value="Create User" />
                </form>
            </div>
            <hr/>
            <div>
                <h1>First Name: {firstName}</h1>
                <h1>Last Name: {lastName}</h1>
                <h1>Email: {email}</h1>
                <h1>Password: {password}</h1>
                <h1>Confirm Password: {confirmPassword}</h1>
            </div>
        </div>
    );
};
    
export default UserForm;

