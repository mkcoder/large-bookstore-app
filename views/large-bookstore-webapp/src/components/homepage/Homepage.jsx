import React from 'react';
import {Link} from 'react-router';

export default class Homepage extends React.Component {
    render () {
        return (
            <section className="homepage">
                <section className="homepage-banner">
                    <img src="http://placehold.it/960x300" />
                </section>
                <section className="promotion recommended-books">
                    <header>
                      <h3>Books recommended for you</h3>
                    </header>
                    <ul>
                      <li className="recommended-book">
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
                      <li className="recommended-book">
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
                      <li className="recommended-book">
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
                      <li className="recommended-book">
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
            </section>
        );
    }
}
