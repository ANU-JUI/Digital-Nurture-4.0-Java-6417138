function Book({book}){
   return (
    <>
    <br></br>
     <h1> Book Details </h1>
     <div>
        {
            book.map(b =>(
                <div>
                    <h2>{b.name}</h2>
                    <br></br>
                    <h3>{b.price}</h3>
                    <br></br>
                 </div>
            ))
        }
     </div>
    </>
   )
}
export default Book;