import React, {PropTypes} from 'react';

import Header from './common/Header';

class App extends React.Component {
    render() {
        return (
            <div className="container">
                <Header />
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
