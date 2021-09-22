import logo from './logo.svg';
import './App.css';
import Table from './Table.js'

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <title> Black Jack Game </title>
      <b> BlackJack Game </b>
      <p> </p>
        <button> Press to Start Game </button>
        <p>You can choose to <b>hit</b> or <b>stick</b>!</p>
        <Table />
      </header>
    </div>
  );
}
export default App;