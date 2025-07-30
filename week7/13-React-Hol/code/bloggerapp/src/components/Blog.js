function Blog({blog}){
   return (
    <>
    <br></br>
     <h1> Blog Details </h1>
     <div>
        {
            blog.map(b =>(
                <div>
                    <h1>{b.topic}</h1>
                    <br></br>
                    <h2>{b.author}</h2>
                    <br></br>
                    <h3>{b.desc}</h3>
                    <br></br>
                 </div>
            ))
        }
     </div>
    </>
   )
}
export default Blog;