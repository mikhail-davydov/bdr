import {Component} from "react";

import "./NavItem.css";

export class NavItem extends Component {

    render() {
        return (
            this.getNavItemContent()
        );
    }

    getNavItemContent() {
        let setMainContent = this.props.setMainContent;

        let navItemIconOnly =
            <li className="nav__item-container" onClick={() => setMainContent(this.props.content)}>
                <div className="nav__item icon">
                    {this.props.icon}
                </div>
            </li>;

        let navItemIconWithText =
            <li className="nav__item-container" onClick={() => setMainContent(this.props.content)}>
                <div className="nav__item icon">
                    {this.props.icon}
                </div>
                <div className="nav__item-text-container">
                    <div className="nav__item-text">
                        {this.props.text}
                    </div>
                </div>
            </li>;

        return (this.props.textVisible) ?
            navItemIconWithText :
            navItemIconOnly;
    }

}