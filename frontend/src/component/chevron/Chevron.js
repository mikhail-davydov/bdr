import {Component} from "react";
import "../common/Common.css";

import "./Chevron.css";

export class Chevron extends Component {

    render() {
        return (
            <div className={this.getChevronClassName()}></div>
        )
    }

    getChevronClassName() {
        return (this.props.isVisible) ?
            this.getChevronDirection() + " visible" :
            this.getChevronDirection();
    }

    getChevronDirection() {
        return "chevron " + this.props.chevronDirectionClass;
    }

}