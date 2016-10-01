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
                <li><h3 className="user-info username">Your Name</h3></li>
                <li>
                    <a href="">Quick links</a>
                    <ul>
                        <li><a href="">Current order status</a></li>
                        <li><a href="">Message center</a></li>
                        <li><a href="">View order history</a></li>
                        <li><a href="">View review history</a></li>
                    </ul>
                </li>
                <li>
                  <i className="fa fa-shopping-cart shopping-cart-icon" aria-hidden="true" />
                  <span className="user-info item-badge" />
                </li>
            </ul>
          </section>
        </div>
    );
  }
}

export default UserInfoBox;
