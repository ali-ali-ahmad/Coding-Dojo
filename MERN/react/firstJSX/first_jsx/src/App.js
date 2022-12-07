// import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
function App() {
  return (
    <div className="App">
      <Header fname="Mohamad" lname="Abed" age={20}/>
      <Header fname="Waleed" lname="Firas" age={30}/>
    </div>
  );
}

export default App;
