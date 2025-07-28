export default function OddPlayers({players}){
    return (
        Even(players[0], players[2], players[4])
    );
}
 function Even(first,third,fifth){
    return (
        <div>
            <h2>Odd Players</h2>
            <ul>
                <li>first : {first}</li>
                <li>third : {third}</li>
                <li>fifth : {fifth}</li>
            </ul>
        </div>
    );
}