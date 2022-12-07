// import logo from './logo.svg';
import './App.css';
import PersonCard from './components/PersonCard';
// import Header from './components/Header';
function App() {
  return (
    <div className="App">
      <PersonCard firstName="Mohamad" lastName="Abed" age={27} hairColor="Black"/>
      <PersonCard firstName="Ali" lastName="Tamrawi" age={25} hairColor="Yellow"/>
      <PersonCard firstName="Ali" lastName="Rabah" age={29} hairColor="Brown"/>
      <PersonCard firstName="Omer" lastName="Salem" age={30} hairColor="Grey"/>
    </div>
  );
}

export default App;
