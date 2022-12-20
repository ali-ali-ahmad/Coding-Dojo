import React from 'react';
import {Routes, Route} from 'react-router-dom';
import Main from './views/Main';
import Detail from './views/Detail';
import './App.css'



const App = () => {

  return (
    <div className="App">
      <Routes>
        <Route element={<Main/>} path='/products'/>
        <Route element={<Detail/>} path= '/products/:id'/>
      </Routes>
    </div>
  );
}
export default App;



