import React from 'react';
import "./Home.css";
import Header from "../header/Header";
import Main from "../main/Main";
import Footer from "../footer/Footer";

class Home extends React.Component {
    render() {
        return (
            <div className="home">
                <Header/>
                <Main/>
                <Footer/>
            </div>
        );
    }
}

export default Home;