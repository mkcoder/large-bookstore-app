import React from 'react';
import { IndexLink, Link } from 'react-router';


const NavBar = () => {
  return (
      <nav id="top-nav-bar" className="nav-bar">
        <ul>
          <li><IndexLink to="/" activeClassName="active">Home</IndexLink></li>
          <li><Link to="/viewAllBooks" activeClassName="active">View All Books</Link></li>
          <li><Link to="/" activeClassName="active">Item 3</Link></li>
          <li><Link to="/" activeClassName="active">Help</Link></li>
        </ul>
      </nav>
  );
};

export default NavBar;
