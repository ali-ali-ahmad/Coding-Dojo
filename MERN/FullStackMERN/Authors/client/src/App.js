import React from 'react';
import {Routes, Route} from 'react-router-dom';
import Main from './views/Main';
import AddAuthor from './views/AddAuthor';
import Detail from './views/Detail';
import Update from './views/Update';
import './App.css'



const App = () => {

  return (
    <>
    <h1>Favorite Authors</h1>
    <div className="App">
      <Routes>
        <Route element={<Main/>} path='/'/>
        <Route element={<AddAuthor/>} path= '/authors'/>
        <Route element={<Detail/>} path= '/authors/:id'/>
        <Route element={<Update/>} path="/authors/:id/edit"/>
      </Routes>
    </div>
    </>
  );
}
export default App;



