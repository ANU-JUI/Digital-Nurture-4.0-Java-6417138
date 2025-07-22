import '../StyleSheets/mystyle.css';
const percentToDecimal=(percent) => {
    return (percent.toFixed(2) +'%');
}
const CalcScore = ({ score, total }) => {
   return percentToDecimal(total/score);
}
export const CalculateScore = ({ Name,School,total,score }) => (
<div className="formatstyle">
    <h1><font color="Brown">Student Details</font></h1>
    <div className="name">
        <b> <span>Name:</span></b>
        <span>{Name}</span>
    </div>
    <div className="school">
        <b> <span>School:</span></b>
        <span>{School}</span>
    </div>
    <div className="total">
        <b> <span>Total:</span></b>
        <span>{total}</span>
    </div>
    <div className="score">
        <b> <span>Score:</span></b>
        <span>{CalcScore({ score, total })}</span>
    </div>
</div>
)