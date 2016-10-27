import React from 'react';

export default class BookClubs extends React.Component {
    render () {
        return (
            <section className="promotion bookclubs">
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
        );
    }
}