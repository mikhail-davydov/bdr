import {Component} from "react";

import "./NavChevron.css";

export class NavChevron extends Component {

    render() {
        return (
            <div className="nav__chevron-container" onClick={this.props.onClick}>
                <div className={this.getNavChevronDirection()}></div>
            </div>
        )
    }

    getNavChevronDirection() {
        return (this.props.visible) ?
            "nav__chevron nav__chevron--left" :
            "nav__chevron nav__chevron--right";
    }

}