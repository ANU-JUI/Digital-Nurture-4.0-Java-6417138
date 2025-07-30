function Course({course}){
   return (
    <>
    <br></br>
     <h1> Course Details </h1>
     <div>
        {
            course.map(b =>(
                <div>
                    <h1>{b.name}</h1>
                    <br></br>
                    <h3>{b.date}</h3>
                    <br></br>
                 </div>
            ))
        }
     </div>
    </>
   )
}
export default Course;