import {Component} from "react";

import "./Company.css";
import "../chevron/Chevron.css";

class Company extends Component {

    render() {
        let className = this.props.chevronUp ?
            "company chevron chevron-up" :
            "company chevron chevron-down";
        return (
            <div className="company-container">
                <div className={className}>
                    <div className="company__text">
                        OOO ROMASHKA
                    </div>
                </div>
            </div>
        )
    }

}

export default Company;