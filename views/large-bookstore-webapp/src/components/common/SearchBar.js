import React from 'react';

export default class SearchBar extends React.Component {
  render( ) {
    return (
        <div className="search-bar">
          <form action="">
            <div className="dropdown-list book-genre">
              <select name="book-genre" id="search-book-genre">
                <option value="all">All</option>
                <option value="fantasy">Fantasy</option>
                <option value="Mystery">Mystery</option>
                <option value="self-help">Self help</option>
              </select>
            </div>
            <input type="search" />
            <button type="submit" className="search-bar search-button">
              <i className="fa fa-search" aria-hidden="true" />
            </button>
          </form>
        </div>
    );
  }
}
