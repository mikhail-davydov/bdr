import React from 'react';
import Header from "../header/Header";
import Main from "../main/Main";
import Footer from "../footer/Footer";
import PayContent from "../content/PayContent";

import "./Home.css";

class Home extends React.Component {

    constructor(props) {
        super(props);
        this.handleButtonClick = this.handleButtonClick.bind(this);
        this.state = {
            content: <PayContent handleButtonClick={this.handleButtonClick}/>
        }
    }

    handleButtonClick(content) {
        this.setState((state) => ({
            content: content
        }));
    }

    render() {
        return (
            <div className="home">
                <Header content={this.state.content}
                        handleButtonClick={this.handleButtonClick}/>
                <Main content={this.state.content}
                      handleButtonClick={this.handleButtonClick}/>
                <Footer/>
            </div>
        );
    }
}

export default Home;