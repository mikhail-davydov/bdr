import React from "react";
import ContentWrapper from "../content/ContentWrapper";

import "../button/Button.css";

import "./Main.css";
import "./__menu/MainMenu.css";

class Main extends React.Component {

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        let periods = "Periods";
        let days = "Days";
        let analytics = "Analytics";
        let recommendations = "Recommendations";

        return (
            <main className="main">
                <ul className="main__menu">
                    <li className="main__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, periods)}>
                            По периодам/Лист 1
                        </button>
                    </li>
                    <li className="main__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, days)}>
                            По дням/Лист 2
                        </button>
                    </li>
                    <li className="main__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, analytics)}>
                            Аналитика
                        </button>
                    </li>
                    <li className="main__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, recommendations)}>
                            Рекомендации
                        </button>
                    </li>
                </ul>
                <ContentWrapper content={this.props.content}/>
            </main>
        );
    }
}

export default Main;