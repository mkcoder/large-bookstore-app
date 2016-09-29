import React, {PropTypes} from 'react';

import NavBar from './common/NavBar.js';

class App extends React.Component {
    render() {
        return (
            <div className="container">
                <header className="page-header">
                  <section className="logo">
                    <h1 className="logo-text">Large Bookstore WebApp</h1>
                    <h4 className="logo-tagline">Where books meet enterprise</h4>
                  </section>
                  <NavBar />
                </header>
                <section className="body">
                    {this.props.children}
                </section>
                <footer className="page-footer" />
            </div>
        );
    }
}

App.propTypes = {
    children: PropTypes.object.isRequired
}

export default App;
