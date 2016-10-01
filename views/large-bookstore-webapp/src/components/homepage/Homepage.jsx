import React from 'react';
import {Link} from 'react-router';

export default class Homepage extends React.Component {
    render () {
        return (
            <section className="homepage">
                <section className="homepage-banner">
                    <img src="http://placehold.it/960x300" />
                </section>
                <section className="recommended-books">
                    <header>
                      <h3>Your books recommended for you</h3>
                    </header>
                    <ul>
                      <li className="recommended-book">
                        <img src="http://placehold.it/100x150" alt="empty book"/>
                      </li>
                      <li className="recommended-book">
                        <img src="http://placehold.it/100x150" alt="empty book"/>
                      </li>
                      <li className="recommended-book">
                        <img src="http://placehold.it/100x150" alt="empty book"/>
                      </li>
                      <li className="recommended-book">
                        <img src="http://placehold.it/100x150" alt="empty book"/>
                      </li>
                      <li className="recommended-book">
                        <img src="http://placehold.it/100x150" alt="empty book"/>
                      </li>
                    </ul>
                </section>
                <section className="recently-view-books">
                  <header>
                    <h3>Continue where you left off</h3>
                  </header>
                  <ul>
                    <li className="recently-view-book">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="recently-view-book">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="recently-view-book">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="recently-view-book">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="recently-view-book">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                  </ul>
                </section>
                <section className="bookclubs">
                  <header>
                    <h3>Join a book club <small>(these book clubs are based on your recent purchases)</small></h3>
                  </header>
                  <ul>
                    <li className="bookclub">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="bookclub">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="bookclub">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="bookclub">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                    <li className="bookclub">
                      <img src="http://placehold.it/100x150" alt="empty book"/>
                    </li>
                  </ul>
                </section>
            </section>
        );
    }
}
