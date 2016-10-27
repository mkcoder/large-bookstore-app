import React from 'react';

export default class RecentlyViewBooks extends React.Component {
    render () {
        return (
            <section className="promotion recently-view-books">
                <header>
                <h3>Continue where you left off</h3>
                </header>
                <ul>
                <li className="recently-view-book">
                    <img src="http://placehold.it/100x150" alt="empty book"/>
                    <div className="info-box book-info-box">
                    <h4>Book title</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        <div className="price-box">
                        <div className="price-info-box">$0.00</div>
                        <button className="default-btn quick-view-btn">View Item</button>
                        </div>
                    </div>
                </li>
                <li className="recently-view-book">
                    <img src="http://placehold.it/100x150" alt="empty book"/>
                    <div className="info-box book-info-box">
                    <h4>Book title</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        <div className="price-box">
                        <div className="price-info-box">$0.00</div>
                        <button className="default-btn quick-view-btn">View Item</button>
                        </div>
                    </div>
                </li>
                <li className="recently-view-book">
                    <img src="http://placehold.it/100x150" alt="empty book"/>
                    <div className="info-box book-info-box">
                    <h4>Book title</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        <div className="price-box">
                        <div className="price-info-box">$0.00</div>
                        <button className="default-btn quick-view-btn">View Item</button>
                        </div>
                    </div>
                </li>
                <li className="recently-view-book">
                    <img src="http://placehold.it/100x150" alt="empty book"/>
                    <div className="info-box book-info-box">
                    <h4>Book title</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        <div className="price-box">
                        <div className="price-info-box">$0.00</div>
                        <button className="default-btn quick-view-btn">View Item</button>
                        </div>
                    </div>
                </li>
                </ul>
            </section>
        );
    }
}