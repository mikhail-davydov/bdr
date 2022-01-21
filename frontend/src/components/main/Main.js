import React from "react";
import ContentWrapper from "../content/ContentWrapper";
import Button from "../button/Button";

import "./Main.css";
import "./__menu/MainMenu.css";

class Main extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            buttonClass: "button"
        };
    }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        let periods = "Periods";
        let days = "Days";
        let analytics = "Analytics";
        let recommendations = "Recommendations";

        return (<main className="main">
                <ul className="main__menu">
                    <li className="main__menu-item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, periods)}
                                buttonValue="По периодам/Лист 1"
                        />
                    </li>
                    <li className="main__menu-item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, days)}
                                buttonValue="По дням/Лист 2"
                        />
                    </li>
                    <li className="main__menu-item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, analytics)}
                                buttonValue="Аналитика"
                        />
                    </li>
                    <li className="main__menu-item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, recommendations)}
                                buttonValue="Рекомендации"
                        />
                    </li>
                </ul>
                <ContentWrapper content={this.props.content}/>
            </main>);
    }
}

export default Main;