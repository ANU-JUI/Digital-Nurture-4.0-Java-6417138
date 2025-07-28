export default function EvenPlayers({players}){
    return (
                Even(players[1], players[3], players[5])

    );
}
 function Even(first,third,fifth){
    return (
        <div>
            <h2>Even Players</h2>
            <ul>
                <li>second : {first}</li>
                <li>fourth :{third}</li>
                <li>sixth : {fifth}</li>
            </ul>
        </div>
    );
}