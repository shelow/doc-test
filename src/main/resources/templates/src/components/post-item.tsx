import * as React from 'react'
import {Post} from '../store/Interfaces'

interface Props {
  item: Post
}

export const boxShadow: string = '0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)'

export const PostItem = ({ item }: Props) =>
    <div style={{ fontFamily: 'Roboto,sans-serif' , boxShadow }}>
        <div style={{ backgroundColor: '#d80f43', marginTop: '3%', color: 'white', padding: '10px 10px 10px' }}>
            {item.title}
        </div>
        <div style={{ background: 'white', padding: '10px 10px 15px' }}>{item.body}</div>
    </div>
