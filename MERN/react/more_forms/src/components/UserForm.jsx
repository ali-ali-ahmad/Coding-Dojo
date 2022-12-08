import React, { useState } from  'react';
import './UserFrom_style.css';
    
    
const UserForm = () => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);
    const [firstNameError, setFirstNameError] = useState("");
    const [lastNameError, setLastNameError] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmPasswordError, setConfirmPasswordError] = useState("");
    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, confirmPassword };
        console.log("Welcome", newUser);
        setHasBeenSubmitted( true );
    };

    const firstNameValidation = (e) => {
        if(e.target.value.length < 1) {
            setFirstNameError("First Name is required!");
        } else if(e.target.value.length < 3) {
            setFirstNameError("First Name must be 3 characters or longer!");
        } else {
            setFirstName(e.target.value);
            setFirstNameError("");
        }
    }
    const lastNameValidation = (e) => {
        if(e.target.value.length < 1) {
            setLastNameError("Last Name is required!");
        } else if(e.target.value.length < 3) {
            setLastNameError("Last Name must be 3 characters or longer!");
        } else {
            setLastName(e.target.value);
            setLastNameError("");
        }
    }
    const emailValidation = (e) => {
        if(e.target.value.length < 1) {
            setEmailError("Email is required!");
        } else if(e.target.value.length < 3) {
            setEmailError("Email must be 3 characters or longer!");
        } else {
            setEmail(e.target.value);
            setEmailError("");
        }
    }
    const passwordValidation = (e) => {
        if(e.target.value.length < 1) {
            setPasswordError("Password is required!");
        } else if(e.target.value.length < 8) {
            setPasswordError("Password must be 8 characters or longer!");
        } else {
            setPassword(e.target.value);
            setPasswordError("");
        }
    }
    const confirmPasswordValidation = (e) => {
        if(e.target.value.length < 1) {
            setConfirmPasswordError("Confirm Password is required!");
        } else if(e.target.value !== password) {
            setConfirmPasswordError("Confirm Password must match password!");
        } else {
            setConfirmPassword(e.target.value);
            setConfirmPasswordError("");
        }
    }

    const formMessage = () => {
        if( hasBeenSubmitted ) {
            return "Thank you for submitting the form!";
        } else {
            return "Welcome, please submit the form";
        }
    };
    
    return(
        <div>
            <div className='formBody'>
                <h3>{ formMessage() }</h3>
                <form onSubmit={ createUser }>
                    <div className='wrapper'>
                        <label>First Name: </label> 
                        <input className='input' type="text" onChange={ firstNameValidation } />
                        {
                        firstNameError ?
                        <p style={{color:'red'}}>{ firstNameError }</p> :
                        ''
                        }
                    </div>
                    <div className='wrapper'>
                        <label>Last Name: </label> 
                        <input className='input' type="text" onChange={lastNameValidation } />
                        {
                        lastNameError ?
                        <p style={{color:'red'}}>{ lastNameError }</p> :
                        ''
                        }
                    </div>
                    <div className='wrapper'>
                        <label>Email Address: </label> 
                        <input className='input' type="text" onChange={emailValidation} />
                        {
                        emailError ?
                        <p style={{color:'red'}}>{ emailError }</p> :
                        ''
                        }
                    </div>
                    <div className='wrapper'>
                        <label>Password: </label>
                        <input className='input' type="text" onChange={passwordValidation} />
                        {
                        passwordError ?
                        <p style={{color:'red'}}>{ passwordError }</p> :
                        ''
                        }
                    </div>
                    <div className='wrapper'>
                        <label>Confirm Password: </label>
                        <input className='input' type="text" onChange={confirmPasswordValidation} />
                        {
                        confirmPasswordError ?
                        <p style={{color:'red'}}>{ confirmPasswordError }</p> :
                        ''
                        }
                    </div>
                    <input className='submit' type="submit" value="Create User" />
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

