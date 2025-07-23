import React from 'react';
class Post{
    constructor(id, title, body) {
        this.title = title;
        this.id = id;
        this.body = body;
    }
}
class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }
    loadPosts() {
        return fetch('https://jsonplaceholder.typicode.com/posts');
    }

    componentDidMount() {
        this.loadPosts()
            .then(response => response.json())
            .then(data => {
                const posts = data.map(post => new Post(post.id, post.title, post.body));
                this.setState({ posts });
            });
    }
    componentDidCatch(error, info) {
        console.error("Error loading posts:", error);
        this.setState({ posts: [] });
    }
    render() {
        return (
            <div>
                <h1>Posts</h1>
                <div>
                    {this.state.posts.map(post => (
                        <div key={post.id}>
                            <h2>{post.title}</h2>
                            <p>{post.body}</p>
                        </div>
                    ))}
                </div>
            </div>
        );
    }
}
export default Posts;