import React from 'react';

class UserInfoBox extends React.Component {

  render() {
    return (
        <div className="user-info login-user user-info-placeholder">
          <section className="user-avatar">
            <img src="/img/default.png" alt="a default user avatar" className="user-info user-avatar"/>
          </section>
          <section>
            <ul>
                <li><h3 className="user-info username">John Doe</h3></li>
                <li className="user-info-nav-bar">
                    <a href="">Quick links</a>
                    <ul>
                        <li><a href="">Current order status</a></li>
                        <li><a href="">Message center</a></li>
                        <li><a href="">View order history</a></li>
                    </ul>
                </li>
                <li className="shopping-cart">
                  <a href="#">
                    <i className="fa fa-shopping-cart shopping-cart-icon" aria-hidden="true" />
                    <span className="user-info item-badge">9+</span>
                  </a>
                </li>
            </ul>
          </section>
        </div>
    );
  }
}

export default UserInfoBox;
