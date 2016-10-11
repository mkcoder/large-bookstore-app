import React from 'react';
import { IndexLink } from 'react-router';


const NavBar = () => {
  return (
      <nav id="top-nav-bar" className="nav-bar">
        <ul>
          <li><IndexLink to="/" activeClassName="active">Home</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Home 2</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Home 3</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Home 4</IndexLink></li>
          <li><IndexLink to="/" activeClassName="active">Home 5</IndexLink></li>
        </ul>
      </nav>
  );
};

export default NavBar;
