import React from "react";
import User from "../user/User";

import "../button/Button.css";

import "./Header.css";
import "./__menu/HeaderMenu.css";
import UserIcon from "../user/user.svg";

class Header extends React.Component {

    // constructor(props) {
    //     super(props);
    //     this.handleClick = this.handleClick.bind(this);
    // }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        // let user = "User Account";
        let user = <img src={UserIcon} alt="User" className="user__img"/>;
        let categories = "Categories";
        let payItems = "Pay items";

        return (
            <header className="header">
                <button className="button" type="button" onClick={this.handleClick.bind(this, user)}>
                    <User/>
                </button>
                <ul className="header__menu">
                    <li className="header__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, categories)}>
                            Категории
                        </button>
                    </li>
                    <li className="header__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, payItems)}>
                            Приход/Расход
                        </button>
                    </li>
                </ul>
            </header>
        )
    }

}

export default Header;