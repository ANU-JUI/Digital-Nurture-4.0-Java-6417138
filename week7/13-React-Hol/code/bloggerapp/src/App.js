import './App.css';
import Book from './components/Book';
import Blog from './components/Blog';
import Course from './components/Course';
import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [displayComponent, setDisplayComponent] = useState('all');

  // Data for the components
  const book = [
    { name: 'Master React', price: 670 },
    { name: 'Deep Dive into Angular 11', price: 800 },
    { name: 'MongoDB Essentials', price: 450 }
  ];
  const course = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/2020' }
  ];
  const blog = [
    { topic: 'React Learning', author: 'Stephen Biz', desc: 'Welcome to Learning React!' },
    { topic: 'Installation', author: 'Schewzdenier', desc: 'You can install React from npm' }
  ];

  return (
    <div>
      {/* Buttons to set the state */}
      <button className="btn btn-primary m-2" onClick={() => setDisplayComponent('book')}>Show Books</button>
      <button className="btn btn-primary m-2" onClick={() => setDisplayComponent('blog')}>Show Blogs</button>
      <button className="btn btn-primary m-2" onClick={() => setDisplayComponent('course')}>Show Courses</button>
      <button className="btn btn-primary m-2" onClick={() => setDisplayComponent('all')}>Show All</button>
      <div className="mt-4">
        {displayComponent === 'book' && <Book book={book} />}

        {displayComponent === 'blog' && <Blog blog={blog} />}

        {displayComponent === 'course' && <Course course={course} />}

        {displayComponent === 'all' && (
          <div className="container">
            <div className="column">
              <Course course={course} />
            </div>
            <div className="column">
              <Book book={book} />
            </div>
            <div className="column">
              <Blog blog={blog} />
            </div>
          </div>
        )}
      </div>
    </div>
  );
}

export default App;