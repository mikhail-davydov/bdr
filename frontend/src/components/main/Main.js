import React from "react";

import "../button/Button.css";

import "./Main.css";
import "./__menu/MainMenu.css";

import "../common/Common.css";

class Main extends React.Component {

    // constructor(props) {
    //     super(props);
    //     this.handleClick = this.handleClick.bind(this);
    // }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        let contentClassName = "content";
        if (this.props.isHidden) {
            contentClassName += " hidden";
        }

        let visible = "";
        if (!this.props.isHidden) {
            visible = "hidden";
        }
        let content = <div className={visible}>{this.props.content}</div>;

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
                <div className={contentClassName}>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid atque blanditiis consequuntur
                    doloribus error esse excepturi, explicabo facere id in nihil odio officiis omnis provident quam
                    qui quisquam quod totam veniam vitae! Dolorem esse ex expedita molestias repellat. Amet
                    assumenda dicta ipsa molestias odio officiis provident similique totam. Magni nesciunt nisi
                    ullam vel veniam. Ad alias asperiores assumenda culpa deleniti dolorem doloremque dolores,
                    ducimus ea eaque esse eveniet expedita iste labore maxime modi nam nobis officiis placeat quae
                    quam quasi quibusdam quidem quis quisquam tempora tempore ut! Nemo quae reiciendis temporibus.
                    Adipisci excepturi ipsum quae reprehenderit voluptate? Magnam, odio, veniam.
                </div>
                {content}
            </main>
        );
    }
}

export default Main;