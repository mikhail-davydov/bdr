import React from 'react';
import "./Home.css";
import Header from "../header/Header";
import Main from "../main/Main";
import Footer from "../footer/Footer";

class Home extends React.Component {

    constructor(props) {
        super(props);
        this.handleButtonClick = this.handleButtonClick.bind(this);
        this.state = {
            isHidden: false
        }
    }

    handleButtonClick(content) {
        this.setState(prevState => ({
            isHidden: !prevState.isHidden,
            content: content
        }));
    }

    render() {
        return (
            <div className="home">
                <Header handleButtonClick={this.handleButtonClick}/>
                <Main isHidden={this.state.isHidden}
                      content={this.state.content}
                      handleButtonClick={this.handleButtonClick}/>
                <Footer/>
            </div>
        );
    }
}

export default Home;