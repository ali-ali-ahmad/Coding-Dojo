import React from 'react'

const Header = (props) => {
  return (
    <div>
      <h1>{props.fname}-{props.lname}</h1>
      <h1>{props.age}</h1>
    </div>
  )
}

export default Header

// rafc 
