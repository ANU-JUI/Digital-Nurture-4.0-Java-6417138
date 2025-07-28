import logo from './logo.svg';
import './App.css';
import Play from './Player';
import Less from './less70';
import EvenPlayers from './EvenPlayers';
import OddPlayers from './OddPlayers';
 class Player {
    constructor(name, score) {
        this.name = name;
        this.score = score;
    }
}
function App() {
  var flag= false;
  var IT=[
    "Sachin1","Dhoni2","Virat3","Rohit4","Yuvraj5","Raina6"];
  const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
 const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  var players = new Array(11);
      players[0] = new Player("Jack", 50);
      players[1] = new Player("Michael", 70);
      players[2] = new Player("John", 40);
      players[3] = new Player("Ann", 61);
      players[4] = new Player("Elisabeth",61);
      players[5] = new Player("Sachin", 95);
      players[6] = new Player("Dhoni", 100);
      players[7] = new Player("Virat", 84);
      players[8] = new Player("Jadeja", 64);
      players[9] = new Player("Raina", 75);
      players[10] = new Player("Rohit", 80);
      if(flag){
  return(
    <div>
    <h1>List of Players</h1>
    <Play players={players} />
    <hr/>
    <h1>List of Players having score less than or equal to 70</h1>
    <Less players={players} />
    </div>)
    }
    if(flag==false){
  return(
    <div>
    
    <OddPlayers players={IT} />
    <hr/>
    <EvenPlayers players={IT} />
    <hr/>
    <h2>List of Indian Players Merged</h2>
    <ul>
      {IndianPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>

  </div>
  )
}
}

export default App;
